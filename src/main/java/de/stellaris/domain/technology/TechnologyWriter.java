package de.stellaris.domain.technology;

import java.nio.file.Path;
import java.util.List;

import de.stellaris.domain.technology.Technology;

/**
 * Service to write technology data.
 * 
 * @author Dustin
 *
 */
public interface TechnologyWriter {

  void writeTechnologies(Path output, List<Technology> technologies) throws WriterException;
}
