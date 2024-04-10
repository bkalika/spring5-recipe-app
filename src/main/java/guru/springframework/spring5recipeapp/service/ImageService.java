package guru.springframework.spring5recipeapp.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by bogdan.kalika@gmail.com
 * Date: 4/10/2024
 */
public interface ImageService {

    void saveImageFile(Long id, MultipartFile file);
}
