//package com.example.hello
//import com.cloudinary.Cloudinary
//import com.cloudinary.Url
//import com.cloudinary.transformation.resize.Resize
//import com.cloudinary.transformation.layer.source.ImageSource.Companion.publicId
//
//object CloudinaryHelper {
//    fun generateImageUrl(publicId: String, width: Int = 200, height: Int = 300): String {
//        return CloudinaryConfig.cloudinary.image {
//            publicId(publicId)
//            resize(Resize.fill {
//                width(width)
//                height(height)
//            })
//        }.toUrl()
//    }
//}
