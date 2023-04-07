package course;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class reminderClass {
        private String name;
        private LocalDateTime startDateTime;

        public reminderClass(String name, LocalDateTime startDateTime) {
            this.name = name;
            this.startDateTime = startDateTime;
        }

        public void remind() {
            LocalDateTime now = LocalDateTime.now();
            long daysUntilStart = ChronoUnit.DAYS.between(now.toLocalDate(), startDateTime.toLocalDate());
            if (daysUntilStart == 1) {
                System.out.println("Reminder: Your course \"" + name + "\" starts tomorrow at " + startDateTime.toLocalTime() + ".");
            }
        }

        public static void main(String[] args) {
            String courseName = "Intro to Programming";
            LocalDate startDate = LocalDate.of(2023, 3, 28); // 假设课程开始日期是2023年4月3日
            LocalTime startTime = LocalTime.of(10, 0); // 假设课程开始时间是上午10点
            LocalDateTime startDateTime = LocalDateTime.of(startDate, startTime);
            reminderClass course = new reminderClass(courseName, startDateTime);
            course.remind();
        }
}

