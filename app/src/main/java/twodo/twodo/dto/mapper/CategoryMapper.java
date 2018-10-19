package twodo.twodo.dto.mapper;

import java.util.ArrayList;

import twodo.twodo.dto.model.Category;
import twodo.twodo.dto.model.ECategory;

public class CategoryMapper {
    public Category map(ECategory eCategory) {
        Category category = new Category();

        category.setId(eCategory.getId());
        category.setName(eCategory.getName());

        return category;
    }

    public ArrayList<Category> map(ArrayList<ECategory> eCategoryList) {
        ArrayList<Category> categoryList = new ArrayList<>();

        for (ECategory eCategory: eCategoryList) {
            categoryList.add(this.map(eCategory));
        }

        return categoryList;
    }
}
