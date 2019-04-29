CREATE TABLE `schedule_task` (
	`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
	`schedule_name` VARCHAR(50) NOT NULL COMMENT '名称',
	`next_exec_time` DATETIME NULL DEFAULT NULL COMMENT '下次执行时间',
	`bean_name` VARCHAR(50) NOT NULL COMMENT 'beanName',
	`task_parameter` VARCHAR(100) NULL DEFAULT NULL COMMENT '任务的参数',
	`exec_plan` VARCHAR(50) NOT NULL COMMENT '执行计划',
	`last_exec_time` DATETIME NULL DEFAULT NULL COMMENT '上次执行时间',
	`status` TINYINT(4) NOT NULL COMMENT '状态 0:已停止 1:待执行 2:执行中 3:已完成',
	`locker` VARCHAR(100) NULL DEFAULT NULL COMMENT '加锁的所有者',
	`error_msg` VARCHAR(100) NULL DEFAULT NULL COMMENT '错误信息',
	`gmt_create` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录创建时间',
	`gmt_modified` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '记录修改时间',
	PRIMARY KEY (`id`),
	UNIQUE INDEX `schedule_name` (`schedule_name`),
	INDEX `next_exec_time` (`next_exec_time`)
)
COMMENT='任务调度器'
COLLATE='utf8_general_ci'
ENGINE=InnoDB;
