/**
 *
 */
package com.multipart.file.service;

import java.nio.file.Path;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author manoranjan
 *
 */
public interface FileStorageService {
	public void init();

	public void save(MultipartFile file);

	public Resource load(String fileName);

	public void deleteAll();

	public Stream<Path> loadAll();
}
