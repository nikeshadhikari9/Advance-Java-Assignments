package MVCExample;

import java.awt.event.*;

public class CounterController {
    public CounterController() {
        CounterView view = new CounterView();
        CounterModel model = new CounterModel();

        view.getButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.increment();  // Increment counter
                int count = model.getCount();  // Get updated count
                view.setLabelText(String.valueOf(count));  // Update label text
            }
        });
    }
}
