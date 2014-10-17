package cascading.legstar.cobolcopybook.translate;

import java.util.HashSet;
import java.util.Set;

public class Cob2FieldsNames {

    /**
     * Contextual prefix to uniquely identify a map entry (used for name
     * conflict resolution)
     */
    private String parentHierarchy = "";

    /** List of unique labels for conflict resolution. */
    private Set<String> uniqueNames = new HashSet<String>();

    public String upHierarchy(String name) {
        String prevPrefix = parentHierarchy;
        parentHierarchy = parentHierarchy + "_"
                + name;
        return prevPrefix;
    }

    public void setHierarchy(String name) {
        parentHierarchy =  name;
    }

    /**
     * Creates a unique name based on a proposed name.
     * <p/>
     * The proposed name is as simple as possible but we need to avoid any name
     * conflicts (a column must have a unique name) so we check for any conflict
     * and use a prefix system to disambiguate names.
     * <p/>
     * It is assumed the same name cannot occur twice at the same hierarchical level.
     *
     * @param proposedName the proposed name
     * @return a unique name for a column
     */
    public String getUniqueName(final String proposedName) {

        String uniqueName = proposedName;

        if (uniqueNames.contains(proposedName)) {
            String[] prefixes = parentHierarchy.split("_");
            int pos = prefixes.length - 1;

            while (uniqueNames.contains(uniqueName) && pos > -1) {
                uniqueName = prefixes[pos] + '_' + uniqueName;
                pos--;
            }
        }

        uniqueNames.add(uniqueName);

        return uniqueName;

    }

}
