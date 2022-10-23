package com.codecool.spingboot_tasks.request_counter.service;

import com.codecool.spingboot_tasks.request_counter.model.Statistics;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RequestCountStatsService {

    public static String GET = "GET";
    public static String POST = "POST";
    public static String PUT = "PUT";
    public static String DELETE = "DELETE";
    public static String PATCH = "PATCH";
    /*
     * Map holding statistics of methods execution. key is method name: GET,PUT etc.
     * value is and integer number representing number of executions
     */
    private final Map<String, Integer> stats = new HashMap<>();

    public void increaseCounter(String method) throws Exception {
        if (stats.isEmpty()) {
            stats.put(GET, 0);
        }


        Integer current = stats.get(method);

        current += 1;
        stats.put(GET, current);

        System.out.println(stats);




    }
    public List<Statistics> getStatistics() {

Statistics statistics=new Statistics();
statistics.setMethodName(GET);
//statistics.setUsage();
List<Statistics> statisticsList=new ArrayList<>();
statisticsList.add(statistics);
        System.out.println(statisticsList);
        return statisticsList;
    }
}