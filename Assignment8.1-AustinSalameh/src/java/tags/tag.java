/*
        Appreciation custom tag
 */
package tags;

import java.io.IOException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author a_sal
 */
public class tag extends SimpleTagSupport {

    
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        out.println("We Appreciate YOU!");
  }
}