package com.huawei._1_fw.component.wf;

/**
 * IMsWFStep<br>
 * 工作流框架：step继承的接口<br>
 * 
 * @author JHercules
 */
public interface IMsWFStep {
	boolean canRun(Object oLastStepContext);

	void run(Object oLastStepContext);
}
