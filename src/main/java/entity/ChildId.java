package entity;

import java.io.Serializable;
import java.util.Objects;

public class ChildId implements Serializable {

    private String parent;  // Child.parent 매핑
    private String childId; // Child.ChildId 매핑

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChildId childId1 = (ChildId) o;
        return Objects.equals(parent, childId1.parent) && Objects.equals(childId, childId1.childId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parent, childId);
    }

    public ChildId() {
    }

    public ChildId(String parent, String childId) {
        this.parent = parent;
        this.childId = childId;
    }
}