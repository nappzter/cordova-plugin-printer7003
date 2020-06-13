package cordova-plugin-printer7003;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class printer7003 extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        /**if (action.equals("coolMethod")) {
            String message = args.getString(0);
            this.coolMethod(message, callbackContext);
            return true;
        }*/

        if (action.equals("print"))
        {
            this.print(args, callbackContext);
            return true;
        
        } else if(action.equals("quitprint")){

            this.quitprint(args, callbackContext);    
            return true;

        }
        return false;
    }

    /**private void coolMethod(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }*/

    private void print(JSONArray args, CallbackContext callback)
    {
        if(args != null)
        {
                try{
                    int p1 = Integer.parseInt(arg.getJSONObject(0).getString("param1"));
                    int p2 = Integer.parseInt(arg.getJSONObject(0).getString("param2"));

                    callback.success(""+ (p1+p2));

                }catch(Execption ex)
                {
                      callback.error("Could not print " + ex);  
                }

        } else {
            callback.error("Please do not pass null value");
        }
    }

    private void quitprint(JSONArray args, CallbackContext callback)
    {
        if(args != null)
        {
                try{
                    int p1 = Integer.parseInt(arg.getJSONObject(0).getString("param1"));
                    int p2 = Integer.parseInt(arg.getJSONObject(0).getString("param2"));

                    callback.success(""+ (p1-p2));

                }catch(Execption ex)
                {
                      callback.error("Could not quit print " + ex);  
                }

        } else {
            callback.error("Please do not pass null value");
        }
    }    
}