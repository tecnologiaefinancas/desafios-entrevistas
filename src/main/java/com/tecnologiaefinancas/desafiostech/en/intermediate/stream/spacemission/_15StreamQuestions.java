package com.tecnologiaefinancas.desafiostech.en.intermediate.stream.spacemission;

import java.util.*;
import java.util.stream.Collectors;

public class _15StreamQuestions {



    public static void main (String[]args) {
        List<SpaceMission> missions = Arrays.asList(
                new SpaceMission("Apollo 11", "Moon", 1969, "NASA", true),
                new SpaceMission("Mars Rover", "Mars", 2003, "NASA", true),
                new SpaceMission("Sputnik", "Earth Orbit", 1957, "Soviet Union", true),
                new SpaceMission("Viking 1", "Mars", 1975, "NASA", true),
                new SpaceMission("Hubble Telescope", "Earth Orbit", 1990, "NASA", true),
                new SpaceMission("Chandrayaan-2", "Moon", 2019, "ISRO", true),
                new SpaceMission("Artemis I", "Moon", 2022, "NASA", false),
                new SpaceMission("SpaceX Dragon", "ISS", 2012, "SpaceX", true)
        );

            /* Challenge: 15 Stream questions.

    1. Filter: Find all space missions that were sent to the Moon.

    2. Map: Create a list of mission names (just the `name` field).

    3. Sort: Sort the missions by their launch year in ascending order.

    4. Limit: Get the first 3 missions that succeeded (`success == true`).

    5. Filter + Count: Count how many missions were launched by NASA.

    6. Group By: Group all missions by their destination (e.g., Moon, Mars, ISS, etc.).

    7. Any Match: Check if there is any mission launched after the year 2020.

    8. All Match Check if all missions to Mars were successful.

    9. Reduce: Find the earliest mission's year (smallest `year` value).

    10. Filter + Collect: Get a list of all failed missions (`success == false`).

    11. Joining: Create a single string of all mission names, separated by commas.

    12. Average: Calculate the average launch year of all missions to the Moon.

    13. Partition By: Partition missions into two groups: successful (`success == true`) and failed (`success == false`).

    14. Distinct Destinations: Get a list of all distinct destinations visited by the missions.

    15. Find First: Find the first mission launched by ISRO (Indian Space Research Organisation).

     */


        //1. Filter: Find all space missions that were sent to the Moon.
        List<SpaceMission> wentToMoonList = missions.stream().filter(spaceMission -> Objects.equals(spaceMission.getDestination(), "Moon")).toList();

        // 2. Map: Create a list of mission names (just the `name` field)."
        List<String> missionNames = missions.stream().map(SpaceMission::getName).sorted().toList();

        // 3. Sort: Sort the missions by their launch year in ascending order."
        List<SpaceMission> missionsByYear = missions.stream().sorted(Comparator.comparing(SpaceMission::getYear)).toList();


        // 4. Limit: Get the first 3 missions that succeeded (`success == true`)."
        List<SpaceMission> firt3MissionsSucceeded = missions.stream().filter(SpaceMission::isSuccess).limit(3).toList();

        // 5. Filter + Count: Count how many missions were launched by NASA.
        long missionsCount = missions.stream().filter(spaceMission -> spaceMission.getAgency().equals("NASA")).count();

        // 6. Group By: Group all missions by their destination (e.g., Moon, Mars, ISS, etc.).
        Map<String, List<SpaceMission>> groupedByDestination = missions.stream().collect(Collectors.groupingBy(SpaceMission::getDestination));

        /*
        Exibir resultados
        groupedByDestination.forEach((destination, missionList) -> {
            System.out.println("Destination: " + destination);
            missionList.forEach(System.out::println);
            System.out.println();
        });
        */

        // 7. Any Match: Check if there is any mission launched after the year 2020.
        List<SpaceMission> missionsLaunchedAfter2020 = missions.stream().filter(mission -> mission.getYear() > 2020).toList();
        // or
        boolean hasMissionAfter2020 = missions.stream().anyMatch(mission -> mission.getYear() > 2020);

        // 8. All Match Check if all missions to Mars were successful.
        boolean allMarsMissionsWereSuccessful = missions.stream().filter(mission -> mission.getDestination().equals("Mars")).allMatch(SpaceMission::isSuccess);
        System.out.println(allMarsMissionsWereSuccessful);

        // 9. Reduce: Find the earliest mission's year (smallest `year` value).
        Optional<Integer> earliestYearMission = missions.stream().map(SpaceMission::getYear).reduce(Integer::min); // Extract years and find the minimum year
        //or
        Optional<SpaceMission> earliestYearMission02 = missions.stream().min(Comparator.comparingInt(SpaceMission::getYear));

        // 10. Filter + Collect: Get a list of all failed missions (`success == false`).
        List<SpaceMission> allFailedMissions = missions.stream().filter(mission -> !mission.isSuccess()).toList();

        //11. Joining: Create a single string of all mission names, separated by commas.
        String ofMissionNames = missions.stream().map(SpaceMission::getName).collect(Collectors.joining(", ")); // Extract mission names and join with ", "

        // System.out.println("All mission names: " + ofMissionNames);

        // 12. Average: Calculate the average launch year of all missions to the Moon.

        int averageLaunchYear = (int) missions.stream().filter(mission -> "Moon".equals(mission.getDestination()))
                .mapToInt(SpaceMission::getYear) // Extract years
                .average()
                .orElse(0);

        // System.out.println("Average launch year of Moon missions: " + averageLaunchYear);

        // 13. Partition By: Partition missions into two groups: successful (`success == true`) and failed (`success == false`).
        Map<Boolean, List<SpaceMission>> partitionerMissions = missions.stream()
                .collect(Collectors.partitioningBy(SpaceMission::isSuccess));

        /*
        System.out.println("Successful Missions:");
        partitionerMissions.get(true).forEach(System.out::println);
        System.out.println("\nFailed Missions:");
        partitionerMissions.get(false).forEach(System.out::println);
        */

        //     14. Distinct Destinations: Get a list of all distinct destinations visited by the missions.
        List<String> distinctDestinations = missions.stream().map(SpaceMission::getDestination).distinct().toList();
        // System.out.println(distinctDestinations);

        //     15. Find First: Find the first mission launched by ISRO (Indian Space Research Organisation).
        Optional<SpaceMission> firstMissionLaunchedByISRO = missions.stream()
                .filter(mission -> "ISRO".equals(mission.getAgency()))
                .findFirst();

        firstMissionLaunchedByISRO.ifPresent(mission ->
                System.out.println("First ISRO mission: " + mission.getName() + " (" + mission.getYear() + ")"));


        // Need to practice more reduce, joining, partition by. I will use the advanced package to continue it.
    }
}
