package com.jsb.rest.request;

import com.jsb.rest.client.JSBHttpMethod;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.response.TradesSoldGetResponse;

public class JSBTradeSoldGetRequest extends JSBRequest<TradesSoldGetResponse>
{
    public JSBTradeSoldGetRequest()
    {
        super();
    }
    
    public void setFields(String fields)
    {
        queryMaps.put("fields", fields);
    }
    
    public void setStartCreated(String start_created)
    {
        queryMaps.put("start_created", start_created);
    }
    
    public void setEndCreated(String end_created)
    {
        queryMaps.put("end_created", end_created);
    }
    
    public void setStatus(String status)
    {
        queryMaps.put("status", status);
    }
    
    public void setBuyerNick(String buyer_nick)
    {
        queryMaps.put("buyer_nick", buyer_nick);
    }
    
    public void setType(String type)
    {
        queryMaps.put("type", type);
    }
    
    public void setExtType(String ext_type)
    {
        queryMaps.put("ext_type", ext_type);
    }
    
    public void setRateStatus(String rate_status)
    {
        queryMaps.put("rate_status", rate_status);
    }
    
    public void setTag(String tag)
    {
        queryMaps.put("tag", tag);
    }
    
    public void setPageNo(Long page_no)
    {
        queryMaps.put("page_no", String.valueOf(page_no));
    }
    
    public void setPageSize(Long page_size)
    {
        queryMaps.put("page_size", String.valueOf(page_size));
    }
    
    public void setHasNext(Boolean use_has_next)
    {
        queryMaps.put("use_has_next", String.valueOf(use_has_next));
    }
    
    @Override
    public String getResourceUrl()
    {
        return "trade/TradesSoldGetRequest";
    }
    
    @Override
    public JSBHttpMethod getMethod()
    {
        return JSBHttpMethod.JSB_METHOD_GET;
    }
    
    @Override
    public Class<TradesSoldGetResponse> getResponseClass()
    {
        return TradesSoldGetResponse.class;
    }
    
    @Override
    public void checkParameter()
        throws ApiRuleException
    {
        RequestCheckUtils.checkNotEmpty(queryMaps.get("fields"), "fields");
    }
    
}
