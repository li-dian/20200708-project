package com.aaa.controller;

import com.aaa.base.BaseController;
import com.aaa.base.ResultData;
import com.aaa.service.SpringCloudService;
import feign.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * @program: 20200708-project
 * @author: LiDian
 * @create: 2020-07-22 09:29:54
 *      部门管理
 **/
@RestController
public class DeptController extends BaseController {

    @Autowired
    private SpringCloudService springCloudService;

    /**
     * @author LiDian
     * @createTime 2020/7/22 9:34
     * @param  []
     * @return com.aaa.base.ResultData
     * @description
     *      查询所有的一级部门以及其下面的子部门
     **/
    @GetMapping("/deptList")
    public ResultData deptList(){

        return springCloudService.deptList();
    }

    /**
     * @author LiDian
     * @createTime 2020/7/22 9:38
     * @param  [map]
     * @return com.aaa.base.ResultData
     * @description
     *      添加部门
     **/
    @PostMapping("/addDept")
    public ResultData addDept(@RequestParam Map map){

        return springCloudService.addDept(map);

    }

    /**
     * @author LiDian
     * @createTime 2020/7/22 9:40
     * @param  [map]
     * @return com.aaa.base.ResultData
     * @description
     *      修改部门
     **/
    @PostMapping("/updateDept")
    public ResultData updateDept(@RequestParam Map map){

        return springCloudService.updateDept(map);

    }

    /**
     * @author LiDian
     * @createTime 2020/7/22 9:42
     * @param  [map]
     * @return com.aaa.base.ResultData
     * @description
     *      删除部门
     **/
    @PostMapping("/delDept")
    public ResultData delDept(@RequestParam Map map){

        return springCloudService.deleteDept(map);

    }

    /**
     * @author LiDian
     * @createTime 2020/7/22 9:44
     * @param  [ids]
     * @return com.aaa.base.ResultData
     * @description
     *      批量删除部门
     **/
    @PostMapping("/delDeptAlls")
    public ResultData delDeptAlls(@RequestParam("ids") List<Long> ids){

        return springCloudService.delDeptAlls(ids);

    }

    /**
     * @author LiDian
     * @createTime 2020/7/22 9:58
     * @param  []
     * @return org.springframework.http.ResponseEntity<byte [ ]>
     * @description
     *      部门Excel导出
     **/
    @GetMapping("/exportDeptExcel")
    public ResponseEntity<byte[]> exportDeptExcel(){
        ResponseEntity<byte[]> result = null;
        Response response = springCloudService.exportDeptExcel();
        Response.Body body = response.body();
        try (InputStream inputStream = body.asInputStream()) {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[10240];
            while (true) {
                int len = inputStream.read(buf);
                if (len < 0) {
                    break;
                }
                bos.write(buf, 0, len);
            }
            byte[] b = bos.toByteArray();
            HttpHeaders heads = new HttpHeaders();
            heads.add(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=部门信息.xls");
            heads.add(HttpHeaders.CONTENT_TYPE, "application/vnd.ms-excel;charset=utf-8");
            heads.add(HttpHeaders.CONNECTION, "close");
            result = new ResponseEntity<>(b, heads, HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}