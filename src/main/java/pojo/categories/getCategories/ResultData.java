package pojo.categories.getCategories;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultData{

	@JsonProperty("categories")
	private List<CategoriesItem> categories;

	public List<CategoriesItem> getCategories(){
		return categories;
	}

	@Override
 	public String toString(){
		return 
			"ResultData{" + 
			"categories = '" + categories + '\'' + 
			"}";
		}
}