package de.stellaris.domain.technology;

import java.nio.file.Path;
import java.util.List;

import de.stellaris.domain.technology.Technology;

/**
 * Service to parse technology game files.
 * 
 * @author Dustin
 *
 */
public interface TechnologyReader {

  public List<Technology> readTechnologies(Path file) throws ReaderException;

}
