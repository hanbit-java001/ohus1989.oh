package com.hanbit.ohus1989.oh.standalone.application;

import com.hanbit.ohus1989.oh.standalone.core.service.SchedulerService;
import com.hanbit.ohus1989.oh.standalone.core.vo.ScheduleVO;

public class SimpleApplication {

	public static void main(String[] args) {
		SchedulerService schedulerService = new SchedulerService();

		ScheduleVO schedule = new ScheduleVO();
		schedule.setScheduleId(String.valueOf(System.currentTimeMillis()));
		schedule.setTitle("����");
		schedule.setMemo("���� ����");
		schedule.setStartDt("201609131830");
		schedule.setEndDt("201609131930");

		int result = schedulerService.addSchedule(schedule);

		System.out.println("���: " + result);
	}

}