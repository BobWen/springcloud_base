package com.bob;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;
import javax.servlet.http.HttpServletRequest;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * @author wenhaibo
 * @date 18-7-27
 */

@Component
public class MyFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        Object accessToken = request.getParameter("token");
        String url = request.getRequestURL().toString();
        if (url.contains("userapi") ||url.contains("swagger")){
            return null;
        }
        if(accessToken == null){
          ctx.setSendZuulResponse(false);
          ctx.setResponseStatusCode(401);
          try{
              ctx.getResponse().getWriter().write("token is empty");
          }catch (Exception e){
              return null;
          }
        }
        return null;
    }
}
