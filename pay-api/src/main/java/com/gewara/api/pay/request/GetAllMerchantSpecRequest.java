/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.gewara.api.pay.request;

import com.gewara.api.pay.ApiRequest;
import java.util.HashMap;
import java.util.Map;

public class GetAllMerchantSpecRequest extends ApiRequest {
	private static final long serialVersionUID = 730928023070576482L;

	public Map<String, String> getTextParams() {
		HashMap params = new HashMap();
		return params;
	}

	public boolean checkParams() {
		return true;
	}
}