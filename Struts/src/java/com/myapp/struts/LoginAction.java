package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author kheta
 */
public class LoginAction extends org.apache.struts.action.Action {

    
    private static final String SUCCESS = "success";
     private static final String FAILURE = "failure";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        LoginForm formBean =(LoginForm) form;    // Limks ActionForm with ActionBean.
        String name =formBean.getName();
        String Email =formBean.getEmail();
        if((name == null)|| (Email ==null)||(name.equals(""))|| (Email.indexOf("@") == -1))
        {
            return mapping.findForward(FAILURE);
        }
        else
        {
        return mapping.findForward(SUCCESS);
       }
        
    }
}
