package com.durga.blogapp.articles.dtos;

import jakarta.annotation.Nullable;
import lombok.Data;
import lombok.NonNull;
import lombok.Setter;

@Data
@Setter
public class UpdateArticleRequest {
    @Nullable
    private String title;
    @Nullable
    private String body;
    @Nullable
    private String subtitle;

}
