package com.huawei.client.provider;

import com.huawei.client.provider.subprovider.Subprovider4Wf1;
import com.huawei.client.provider.subprovider.Subprovider4Wf2;

public class MainProvider {
	// #region wf1

	public static String wf1() {
		return Subprovider4Wf1.wf1();
	}

	// #endregion

	// #region wf2

	public static String wf2() {
		return Subprovider4Wf2.wf2();
	}

	// #endregion
}
