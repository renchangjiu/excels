package red.htt.excels.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.File;

/**
 * @author yui
 */
@Data
@Accessors(chain = true)
public class ExcelFile {

    private File in;

    private File out;

}
