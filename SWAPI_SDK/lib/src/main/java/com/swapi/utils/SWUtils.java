package com.swapi.utils;

import android.text.TextUtils;
import com.swapi.models.People;
import com.swapi.models.Vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Oleur on 24/12/2014.
 * Utility class for Star Wars API
 */
public class SWUtils {

    public enum SORT {
        ASC,
        DESC
    }

    public static int compare(int lhs, int rhs) {
        return lhs < rhs ? -1 : (lhs == rhs ? 0 : 1);
    }

    public static ArrayList<People> sortPeopleByMass(ArrayList<People> peopleList, final SORT sortBy) {
        if (peopleList == null) {
            return null;
        }
        Collections.sort(peopleList, new Comparator<People>() {
            @Override
            public int compare(People lhs, People rhs) {
                int heightLhs = Integer.parseInt(lhs.mass);
                int heightRhs = Integer.parseInt(rhs.mass);
                if (sortBy == SORT.ASC) {
                    return SWUtils.compare(heightLhs, heightRhs);
                } else {
                    return SWUtils.compare(heightRhs, heightLhs);
                }
            }
        });
        return peopleList;
    }

    public static ArrayList<People> sortPeopleByHeight(ArrayList<People> peopleList, final SORT sortBy) {
        if (peopleList == null) {
            return null;
        }
        Collections.sort(peopleList, new Comparator<People>() {
            @Override
            public int compare(People lhs, People rhs) {
                int heightLhs = Integer.parseInt(lhs.height);
                int heightRhs = Integer.parseInt(rhs.height);
                if (sortBy == SORT.ASC) {
                    return SWUtils.compare(heightLhs, heightRhs);
                } else {
                    return SWUtils.compare(heightRhs, heightLhs);
                }
            }
        });
        return peopleList;
    }

    public static boolean isEmpireVehicle(Vehicle vehicle) {
        if (vehicle == null || TextUtils.isEmpty(vehicle.manufacturer)) {
            return false;
        }
        return (vehicle.manufacturer.contains("Sienar")
                    || vehicle.manufacturer.contains("Kuat")
                    || vehicle.manufacturer.contains("Imperial")
                    || vehicle.manufacturer.contains("Aratech"));
    }

    public static String filmUrlToFilmTitle(String filmUrl) {
        int filmId;
        try {
            filmId = filmUrl.charAt(filmUrl.length()-2);
        } catch (Exception e) {
            return null;
        }
        switch (filmId) {
            case 1:
                return "Star Wars Episode IV A New Hope";
            case 2:
                return "Star Wars Episode V The Empire Strikes Back";
            case 3:
                return "Star Wars Episode VI Return of the Jedi";
            case 4:
                return "Star Wars Episode I The Phantom Menace";
            case 5:
                return "Star Wars Episode II Attack of the Clones";
            case 6:
                return "Star Wars Episode III Revenge of the Sith";
            default:
                return null;
        }
    }
}
