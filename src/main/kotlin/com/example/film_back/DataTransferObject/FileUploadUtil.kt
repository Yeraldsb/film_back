package com.example.film_back.DataTransferObject

import org.springframework.web.multipart.MultipartFile
import java.io.IOException
import java.io.InputStream
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.StandardCopyOption

class FileUploadUtil {


    fun savedFile(uploadDir: String, fileName: String, multipartFile: MultipartFile) {
        val uploadPath: Path = Paths.get(uploadDir)

        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath)
        }

        try {
            val inputStream: InputStream = multipartFile.inputStream
            val filePath: Path = uploadPath.resolve(fileName)
            Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING)
        } catch (e: IOException) {
            throw IOException("Could not save file $fileName", e)
        }
    }
}