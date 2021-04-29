package red.htt.excels.utils.poi;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @author yui
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
public class SheetData<T> {

    private List<T> data;
    private Class<T> clazz;

    private String sheetName;
}
