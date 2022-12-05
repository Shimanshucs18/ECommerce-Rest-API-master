package com.tothenew.shimanshu.Dto.Response;

import com.tothenew.shimanshu.Model.Category;
import lombok.Data;
import java.util.List;

@Data
public class ViewCategoryDto {

    private Category currentCategory;
    private List<Category> childCategories;
}
