package com.huawei.client;

import org.springframework.stereotype.Service;

import com.huawei.client.provider.MainProvider;

@Service
public class WorkflowService {
	// #region wf1

	public String wf1() {
		return MainProvider.wf1();
	}

	// #endregion

	// #region wf2

	public String wf2() {
		return MainProvider.wf2();
	}

	// #endregion
}
