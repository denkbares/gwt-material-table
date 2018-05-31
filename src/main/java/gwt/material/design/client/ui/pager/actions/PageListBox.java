package gwt.material.design.client.ui.pager.actions;

import gwt.material.design.client.ui.MaterialListValueBox;
import gwt.material.design.client.ui.pager.MaterialDataPager;

/**
 * A {@link PageSelection} component that provides a {@link MaterialListValueBox} to enumerate and display
 * all the page numbers thru lazy loading lists. This can be set with {@link MaterialDataPager#setPageSelection(PageSelection)},
 * see {@link PageNumberBox} as another display option.
 *
 * @author kevzlou7979
 */
public class PageListBox extends AbstractPageSelection<MaterialListValueBox<Integer>> {

    protected MaterialListValueBox<Integer> dropdown = new MaterialListValueBox<>();

    public PageListBox() {
        super();
    }

    public PageListBox(MaterialDataPager<?> pager) {
        super(pager);
    }

    @Override
    protected void setup() {
    }

    @Override
    public MaterialListValueBox<Integer> getComponent() {
        return dropdown;
    }

    @Override
    public void updateTotalPages(int totalPages) {
        dropdown.clear();
        for (int i = 1; i <= totalPages; i++) {
            dropdown.addItem(i, false);
        }

        dropdown.reload();
        dropdown.setValue(pager.getCurrentPage());
    }
}
