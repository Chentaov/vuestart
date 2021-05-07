package cct.vuestart.view;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class vueview {
    @RequestMapping("test")
    public JSONObject test(){
        JSONObject obj = new JSONObject();
        obj.put("obj1",1);
        obj.put("obj2",2);
        return obj;
    }
}
