package com.huawei.client.provider.subprovider;

import com.huawei._1_fw.component.wf.MsWFProvider;
import com.huawei.client.provider.subprovider.steps.common.CommonStep1;
import com.huawei.client.provider.subprovider.steps.wf1.Step1;

public class Subprovider4Wf1 {
	// #region wf1

	public static String wf1() {
		MsWFProvider.fireStep(CommonStep1.class, "StartContext");
		MsWFProvider.fireStep(Step1.class, "CommonStep1Context");
		return "ok";
	}

	// #endregion
}
