package de.stellaris.domain.technology;

import java.util.function.Predicate;

/**
 * Provides several filters for technology lists.
 * 
 * @author Dustin
 *
 */
public class TechnologyFilters {

  /**
   * Predicate for all 'usual' technology.
   */
  public static Predicate<Technology> defaultList() {
    return notStartTech()
        .and(notDangerous());
  }

  private static Predicate<Technology> notStartTech() {
    return tech -> !tech.isStartTech();
  }

  private static Predicate<Technology> notDangerous() {
    return tech -> !tech.isDangerous();
  }

  private TechnologyFilters() {
  }
}
