package com.huawei._1_fw.component.wf;

/**
 * IMsWFStep<br>
 * ��������ܣ�step�̳еĽӿ�<br>
 * 
 * @author JHercules
 */
public interface IMsWFStep {
	boolean canRun(Object oLastStepContext);

	void run(Object oLastStepContext);
}
