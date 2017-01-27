package com.huawei.client.provider.subprovider;

import com.huawei._1_fw.component.wf.MsWFProvider;
import com.huawei.client.provider.subprovider.steps.wf2.Step2;

public class Subprovider4Wf2 {
	// #region wf2

	public static String wf2() {
		MsWFProvider.fireStep(Step2.class, "StartContext");
		return "ok";
	}

	// #endregion
}
