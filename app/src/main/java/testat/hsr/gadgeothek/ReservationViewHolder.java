package testat.hsr.gadgeothek;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import testat.hsr.gadgeothek.domain.Gadget;
import testat.hsr.gadgeothek.domain.Reservation;

public class ReservationViewHolder extends ItemViewHolder<Reservation> {

    private TextView view;
    private TextView nameInner;
    private LinearLayout expandable;
    private TextView manufacturer;
    private TextView condition;
    private TextView price;
    private TextView inventorynr;

    public ReservationViewHolder(View itemRoot) {
        super(itemRoot);
        this.setParent(itemRoot);

        this.view = (TextView) itemRoot.findViewById(R.id.textView);
        this.nameInner = (TextView) itemRoot.findViewById(R.id.gadgetNameInner);
        this.expandable = (LinearLayout) itemRoot.findViewById(R.id.expandableText);
        this.manufacturer = (TextView) itemRoot.findViewById(R.id.manufacturer);
        this.condition = (TextView) itemRoot.findViewById(R.id.condition);
        this.price = (TextView) itemRoot.findViewById(R.id.price);
        this.inventorynr = (TextView) itemRoot.findViewById(R.id.inventorynr);
    }

    @Override
    public void bind(Reservation reservation, boolean expanded) {
        Gadget g = reservation.getGadget();
        view.setText(g.getName());
        nameInner.setText(g.getName());
        inventorynr.setText("Inventorynumber: " + g.getInventoryNumber());
        price.setText("Price: " + g.getPrice());
        condition.setText("Condition: " + g.getCondition());
        manufacturer.setText("Manufacturer: " + g.getManufacturer());

        if (expanded) {
            view.setVisibility(View.GONE);
            expandable.setVisibility(View.VISIBLE);
        } else {
            view.setVisibility(View.VISIBLE);
            expandable.setVisibility(View.GONE);
        }
    }
}