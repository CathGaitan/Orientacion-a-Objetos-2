package ar.edu.unlp.info.oo2.P4_ejer1;

import java.util.Collection;
import java.util.List;

public interface DatabaseAccess {
    Collection<String> getSearchResults(String queryString);
    int insertNewRow(List<String> rowData);
}