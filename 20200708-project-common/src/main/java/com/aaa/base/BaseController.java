package com.aaa.base;

import static com.aaa.status.OperationStatus.*;
import static com.aaa.status.LoginStatus.*;

/**
 * @Company AAA软件教育
 * @Author LiDian
 * @Date Create in 2020/7/8 11:11
 * @Description
 *      统一controller
 *      也就是说所有的controller都需要继承这个controller，进行统一返回
 *
 *      eg:
 *          登录成功和失败
 *          code:200 msg:登录成功
 *          code:400 msg:登录失败，系统异常
 *          code:201 msg:用户已经存在
 *          code:401 msg:用户不存在
 *          code:402 msg:密码错误
 *          code:405 msg:用户退出异常
 *
 **/
public class BaseController {

    /**
     *      登录成功
     *      使用系统消息
     * @return
     */
    protected ResultData loginSuccess() {
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(LOGIN_SUCCESS.getMsg());
        return resultData;
    }

    /**
     *      登录成功
     *      自定义返回消息
     * @param msg
     * @return
     */
    protected ResultData loginSuccess(String msg) {
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(msg);
        return resultData;
    }

    /**
     *      登录成功
     *      返回数据信息，使用系统消息
     * @param data
     * @return
     */
    protected ResultData loginSuccess(Object data) {
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(LOGIN_SUCCESS.getMsg());
        resultData.setData(data);
        return resultData;
    }

    /**
     *      登录成功
     *      返回数据信息，自定义消息
     * @param msg
     * @param data
     * @return
     */
    protected ResultData loginSuccess(String msg, Object data) {
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_SUCCESS.getCode());
        resultData.setMsg(msg);
        resultData.setData(data);
        return resultData;
    }

    /**
     *      登录失败，使用系统消息
     * @return
     */
    protected ResultData loginFailed() {
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_FAILED.getCode());
        resultData.setMsg(LOGIN_FAILED.getMsg());
        return resultData;
    }

    /**
     * 登录失败，使用系统消息，详细解释说明
     * @param detail
     * @return
     */
    protected ResultData loginFailed(String detail) {
        ResultData resultData = new ResultData();
        resultData.setCode(LOGIN_FAILED.getCode());
        resultData.setMsg(LOGIN_FAILED.getMsg());
        resultData.setDetail(detail);
        return resultData;
    }

    /**
     * 操作成功，返回系统消息
     * @return
     */
    protected ResultData operationSuccess() {
        ResultData resultData = new ResultData();
        resultData.setCode(SUCCESS.getCode());
        resultData.setMsg(SUCCESS.getMsg());
        return resultData;
    }

    /**
     * 操作成功，返回系统消息
     * @param data
     * @return
     */
    protected ResultData operationSuccess(Object data) {
        ResultData resultData = new ResultData();
        resultData.setCode(SUCCESS.getCode());
        resultData.setMsg(SUCCESS.getMsg());
        resultData.setData(data);
        return resultData;
    }

    /**
     * 操作失败，返回系统消息
     * @return
     */
    protected ResultData operationFailed() {
        ResultData resultData = new ResultData();
        resultData.setCode(FAILED.getCode());
        resultData.setMsg(FAILED.getMsg());
        return resultData;
    }

    /**
     * 操作失败，返回自定义消息
     * @param msg
     * @return
     */
    protected ResultData operationFailed(String msg) {
        ResultData resultData = new ResultData();
        resultData.setCode(FAILED.getCode());
        resultData.setMsg(msg);
        return resultData;
    }

    // TODO 代码未完善，记得补充


    /**
     * 查询成功，返回自定义消息，返回一条数据
     * @return
     */
    protected ResultData operationSuccess(Object data,String msg){
        ResultData resultData = new ResultData();
        resultData.setCode(SUCCESS.getCode());
        resultData.setMsg(msg);
        resultData.setData(data);
        return resultData;
    }

    /**
     * 新增数据成功，返回系统消息
     * @return
     */
    protected ResultData addSuccess(){
        ResultData resultData = new ResultData();
        resultData.setCode(INSERT_OPERATION_SUCCESS.getCode());
        resultData.setMsg(INSERT_OPERATION_SUCCESS.getMsg());
        return resultData;
    }

    /**
     * 新增数据成功，返回自定义消息
     * @return
     */
    protected ResultData addSuccess(String msg){
        ResultData resultData = new ResultData();
        resultData.setCode(INSERT_OPERATION_SUCCESS.getCode());
        resultData.setMsg(msg);
        return resultData;
    }

    /**
     * 新增数据失败，返回系统消息
     * @return
     */
    protected ResultData addFailed(){
        ResultData resultData = new ResultData();
        resultData.setCode(INSERT_OPERATION_FAILED.getCode());
        resultData.setMsg(INSERT_OPERATION_FAILED.getMsg());
        return resultData;
    }

    /**
     * 新增数据失败，返回自定义消息
     * @return
     */
    protected ResultData addFailed(String msg){
        ResultData resultData = new ResultData();
        resultData.setCode(INSERT_OPERATION_FAILED.getCode());
        resultData.setMsg(msg);
        return resultData;
    }

    /**
     * 新增数据已存在，返回系统消息
     * @return
     */
    protected ResultData addExist(){
        ResultData resultData = new ResultData();
        resultData.setCode(INSERT_OPERATION_EXIST.getCode());
        resultData.setMsg(INSERT_OPERATION_EXIST.getMsg());
        return resultData;
    }

    /**
     * 新增数据已存在，返回自定义消息
     * @return
     */
    protected ResultData addExist(String msg){
        ResultData resultData = new ResultData();
        resultData.setCode(INSERT_OPERATION_EXIST.getCode());
        resultData.setMsg(msg);
        return resultData;
    }

    /**
     * 删除成功，返回系统消息
     * @return
     */
    protected ResultData deleteSuccess(){
        ResultData resultData = new ResultData();
        resultData.setCode(DELETE_OPERATION_SUCCESS.getCode());
        resultData.setMsg(DELETE_OPERATION_SUCCESS.getMsg());
        return resultData;
    }

    /**
     * 删除成功，返回自定义消息
     * @return
     */
    protected ResultData deleteSuccess(String msg){
        ResultData resultData = new ResultData();
        resultData.setCode(DELETE_OPERATION_SUCCESS.getCode());
        resultData.setMsg(msg);
        return resultData;
    }

    /**
     * 删除失败，返回系统消息
     * @return
     */
    protected ResultData deleteFailed(){
        ResultData resultData = new ResultData();
        resultData.setCode(DELETE_OPERATION_FAILED.getCode());
        resultData.setMsg(DELETE_OPERATION_FAILED.getMsg());
        return resultData;
    }

    /**
     * 删除失败，返回自定义消息
     * @return
     */
    protected ResultData deleteFailed(String msg){
        ResultData resultData = new ResultData();
        resultData.setCode(DELETE_OPERATION_FAILED.getCode());
        resultData.setMsg(msg);
        return resultData;
    }

    /**
     * 删除数据不存在，返回系统消息
     * @return
     */
    protected ResultData deleteExist(){
        ResultData resultData = new ResultData();
        resultData.setCode(DELETE_OPERATION_EXIST.getCode());
        resultData.setMsg(DELETE_OPERATION_EXIST.getMsg());
        return resultData;
    }

    /**
     * 删除数据不存在，返回自定义消息
     * @return
     */
    protected ResultData deleteExist(String msg){
        ResultData resultData = new ResultData();
        resultData.setCode(DELETE_OPERATION_EXIST.getCode());
        resultData.setMsg(msg);
        return resultData;
    }

    /**
     * 修改成功，返回系统消息
     * @return
     */
    protected ResultData updateSuccess(){
        ResultData resultData = new ResultData();
        resultData.setCode(UPDATE_OPERATION_SUCCESS.getCode());
        resultData.setMsg(UPDATE_OPERATION_SUCCESS.getMsg());
        return resultData;
    }

    /**
     * 修改成功，返回自定义消息
     * @return
     */
    protected ResultData updateSuccess(String msg){
        ResultData resultData = new ResultData();
        resultData.setCode(UPDATE_OPERATION_SUCCESS.getCode());
        resultData.setMsg(msg);
        return resultData;
    }

    /**
     * 修改失败，返回系统消息
     * @return
     */
    protected ResultData updateFailed(){
        ResultData resultData = new ResultData();
        resultData.setCode(UPDATE_OPERATION_FAILED.getCode());
        resultData.setMsg(UPDATE_OPERATION_FAILED.getMsg());
        return resultData;
    }

    /**
     * 修改失败，返回自定义消息
     * @return
     */
    protected ResultData updateFailed(String msg){
        ResultData resultData = new ResultData();
        resultData.setCode(UPDATE_OPERATION_FAILED.getCode());
        resultData.setMsg(msg);
        return resultData;
    }

    /**
     * 修改数据已存在，返回系统消息
     * @return
     */
    protected ResultData updateExist(){
        ResultData resultData = new ResultData();
        resultData.setCode(UPDATE_OPERATION_EXIST.getCode());
        resultData.setMsg(DELETE_OPERATION_EXIST.getMsg());
        return resultData;
    }

    /**
     * 修改数据已存在，返回自定义消息
     * @return
     */
    protected ResultData updateExist(String msg){
        ResultData resultData = new ResultData();
        resultData.setCode(DELETE_OPERATION_EXIST.getCode());
        resultData.setMsg(msg);
        return resultData;
    }

}
