package com.aaa.base;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.Map;

/**
 * @program: 20200708-project
 * @author: LiDian
 * @create: 2020-07-09 20:24:06
 **/
public abstract class CommonController<T> extends BaseController {

    /**
     *      钩子函数
     *      在新增之前去执行某些操作
     *
     *      下单操作:
     *          需求
     *              在购物车中当点击立即下单按钮的时候--->跳转下单页面(选择地址，选择优惠券...)
     *              把购物车中的这个商品删除
     *              deleteCart(List<Integer> id);--->是优先于insertOrder前置执行
     *
     *          insertOrder(Order oder);

     * @param map
     */
    protected void beforeAdd(Map map){
        //TODO AddMethod Before to do something
    }

    /**
     *      钩子函数
     *      是在新增之后去执行
     *
     *      int result = insertOrder(Order order)
     *      if(result > 0) {
     *          insertOrderDetail(OrderDetail orderDetail);
     *      }
     * @param map
     */
    protected void afterAdd(Map map){
        //TODO AddMethod After to do something
    }

    public abstract BaseService<T> getBaseService();


    /**
     *      通用的新增方法
     *      因为咱们目前市面上所有的公司实现的全是异步了
     *      也就是说前端向后端所传递的数据都是json格式
     *      之前在controller的方法中接收固定的实体类，是因为你知道前端给你传递的类型就是这个实体类
     *      但是既然要做通用，前端所传递的类型就不会固定了--->所以使用Map类型来统一接收
     * @param map
     * @return
     */
    public ResultData add(@RequestBody Map map){
        //因为根据咱们的封装规则，在service中是需要传递泛型的，就意味着service需要接收固定的实体类
        //但是controller是一个Map类型
        beforeAdd(map);
        //1.Map转实体类
        T instance = getBaseService().newInstance(map);
        //2.通用service
        Integer addResult = getBaseService().add(instance);
        if(addResult > 0){
            afterAdd(map);
            return super.operationSuccess();
        }
        return super.operationFailed();
    }

    /**
     * 删除操作
     * @param map
     * @return
     */
    public ResultData  delete(@RequestBody Map map){
        T instance = getBaseService().newInstance(map);
        Integer deleteResult = getBaseService().delete(instance);
        if(deleteResult > 0){
            return  super.operationSuccess();
        }
        return super.operationFailed();
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    public ResultData batchDelete(@RequestParam("ids[]") Integer[] ids){
        Integer deleteResult = getBaseService().deleteByIds(Arrays.asList(ids));
        if(deleteResult > 0){
            return super.operationSuccess();
        }
        return super.operationFailed();
    }
}