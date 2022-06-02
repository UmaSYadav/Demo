package practice.java8.dates;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Set;

public class DateTimeApi {

	public static void main(String[] args) {

		System.out.println(TemporalAdjusters.firstDayOfMonth());

		ZoneId vZone= ZoneId.of("UTC");//"Asia/Kolkata");
		Set<String> pZones= ZoneId.getAvailableZoneIds();
		//pZones.forEach((pId)-> {System.out.println(pId)});
		//ZoneId.from(null)

		//ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;

		//Asia/Kolkata
		//Temporal vTemporal1= Temporal.

		//Duration vDuration1= Duration.between(null, null)

//		System.out.println(Clock.systemDefaultZone());
//		System.out.println(Clock.systemUTC());
//		System.out.println(Clock.tickMillis(vZone));
//		System.out.println(Clock.tickMinutes(vZone));
//		System.out.println(Clock.tickSeconds(vZone));
//		System.out.println(Clock.system(vZone));

		System.out.println(LocalDate.now());
		System.out.println(LocalDate.now(vZone));
		System.out.println(LocalTime.now());
		System.out.println(LocalTime.now(vZone));
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDateTime.now(vZone));
		System.out.println(LocalDate.MAX+":::"+LocalDate.MIN+":::"+LocalDate.EPOCH);
		System.out.println(LocalTime.MAX+":::"+LocalTime.MIN+":::"+LocalTime.MIDNIGHT+":::"+LocalTime.NOON);
		System.out.println(LocalDateTime.MAX+":::"+LocalDateTime.MIN);
		System.out.println(LocalDateTime.now(Clock.systemDefaultZone()));
	}

}
