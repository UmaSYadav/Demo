package practice.java8.CollecorsPr;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import practice.java8.CollecorsPr.dto.CollectorsDto;


public class CollectorsImpl {

	public static void main(String[] args) {
		
		ArrayList<CollectorsDto> vAlCollectorsDto= new ArrayList<>();
		vAlCollectorsDto.add(new CollectorsDto(1, "Uma", 10000));
		vAlCollectorsDto.add(new CollectorsDto(2, "Shankar", 20000));
		vAlCollectorsDto.add(new CollectorsDto(3, "Yadav", 30000));
		vAlCollectorsDto.add(new CollectorsDto(4, "Uma Yadav", 40000));
		vAlCollectorsDto.add(new CollectorsDto(5, "Mau", 35000));
		
		List<Double> vListDto= vAlCollectorsDto.stream().map(vCal -> vCal.getdSalary()).collect(Collectors.toList());
		System.out.println(vListDto);
		
		Set<Double> vSetDto= vAlCollectorsDto.stream().map(vCal -> vCal.getdSalary()).collect(Collectors.toSet());
		System.out.println(vSetDto);
		
		double vSum= vAlCollectorsDto.stream().collect(Collectors.summingDouble(vCa -> vCa.getdSalary()));
		System.out.println("Sum: "+vSum);
		
		double vAvg= vAlCollectorsDto.stream().collect(Collectors.averagingDouble(vCa -> vCa.getdSalary()));
		System.out.println("Sum: "+vAvg);
		
		Long vCount= vAlCollectorsDto.stream().collect(Collectors.counting());
		Long vCount2= vAlCollectorsDto.stream().map(vCal -> vCal.getdSalary() > 40000).collect(Collectors.counting());
		System.out.println("Count: "+vCount+" -- "+vCount2);
		
	}

}
