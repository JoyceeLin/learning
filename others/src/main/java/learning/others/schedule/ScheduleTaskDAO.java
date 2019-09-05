package learning.others.schedule;///**
// * BrandBigData.com Inc.
// * Copyright (c) 2016 All Rights Reserved.
// */
//package learning.others.schedule;
//
//import java.time.LocalDateTime;
//import java.util.List;
//import javax.transaction.Transactional;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
///**
// * @author xumin
// * @version $Id:ScheduleTaskDAO.java, v0.1 2017/12/19 18:31 xumin
// */
//@Repository
//@Transactional
//public interface ScheduleTaskDAO extends JpaRepository<ScheduleTaskDO, Integer>, JpaSpecificationExecutor<ScheduleTaskDO> {
//
//    ScheduleTaskDO findFirstByStatusAndLocker(int status, String locker);
//
//    @Query(value = "UPDATE ScheduleTaskDO t SET t.status=2,t.locker=?1 WHERE t.status=1 AND t"
//            + ".nextExecTime<CURRENT_TIME()")
//    @Modifying(clearAutomatically = true)
//    int lockTask(String locker);
//
//    ScheduleTaskDO findByScheduleName(String scheduleName);
//
//    @Query(value = "DELETE FROM ScheduleTaskDO t WHERE t.scheduleName like CONCAT(:scheduleName,'%') ")
//    @Modifying(clearAutomatically = true)
//    void deleteByScheduleNameLike(@Param("scheduleName") String scheduleName);
//
//    @Query("UPDATE ScheduleTaskDO t SET t.status=1 WHERE t.status=2 AND t.gmtCreate < ?1")
//    @Modifying(clearAutomatically = true)
//    int unlockTasks2(LocalDateTime nowAfterFiveSeconds);
//
//    @Query(value = "UPDATE ScheduleTaskDO t SET t.lastExecTime = CURRENT_TIME() WHERE t.id = ?1")
//    @Modifying(clearAutomatically = true)
//    int modifyLastExecTime(long id);
//
//
//    List<ScheduleTaskDO> findByStatusAndLocker(int statusExecuting, String locker);
//}
