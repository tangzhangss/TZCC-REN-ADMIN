import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import cn.hutool.script.JavaScriptEngine;
import cn.hutool.script.ScriptUtil;
import com.alibaba.fastjson.JSON;
import com.tangzhangss.commonutils.utils.BaseUtil;
import com.tangzhangss.commonutils.utils.JPAUtil;
import io.lettuce.core.internal.HostAndPort;
import org.junit.platform.commons.util.StringUtils;

import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class BaseTest {

    /**
     * 测试JSON parse走不走set get
       打断点
       要走set 方法
     */
    public static void main1(String[] args) {
        JSONObject obj = new JSONObject();
        obj.set("A","my is A's val");
        BaseEntity baseEntity = JSONUtil.toBean(obj, BaseEntity.class);
        BaseEntity baseEntity2 = JSON.parseObject(JSONUtil.toJsonStr(obj), BaseEntity.class);

        System.out.println(JPAUtil.sqlHandle(null,"ssss"));

    }

    /**
     * 测试float比较
     */
    public static void main(String[] args) throws ScriptException {
        /*String str = "  var msg='hello';          "
                + "  var number = 123;         "
                + "  var array=['A','B','C'];  "
                + "  var json={                "
                + "      'name':'pd',          "
                + "      'subjson':{           "
                + "           'subname':'spd'  "
                + "           ,'id':123        "
                + "           }                "
                + "      };                    ";
        ScriptEngine jsEngine = ScriptUtil.createJsEngine();
        jsEngine.eval(str);
        Object number = jsEngine.get("number");
        Object json = jsEngine.get("json");
        Object array = jsEngine.get("array");

        System.out.println(number);*/

        int[] arr= new int[]{8,8,8,8,8,8,6,6,6,6};
        int indexL = 0;
        int indexM = (arr.length-1)/2;
        int indexR = arr.length-1;
        do{
           int tempV = arr[indexM];
            if(tempV==8){
               indexL= indexM;
           }else{
               indexR = indexM;
           }
           indexM = (indexR+indexL)/2;

        }while(!(indexL==indexM||indexR==indexM));

        System.out.println(indexM);
    }


}
