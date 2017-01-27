package com.huawei.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkflowController {
	// #region Fields

	@Autowired
	private WorkflowService workflowService;

	// #endregion

	// #region wf1

	@RequestMapping("/wf1")
	@ResponseBody
	public String wf1() {
		return this.workflowService.wf1();
	}

	// #endregion

	// #region wf2

	@RequestMapping("/wf2")
	@ResponseBody
	public String wf2() {
		return this.workflowService.wf2();
	}

	// #endregion
}
