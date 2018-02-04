package netgloo.hello;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import netgloo.models.PlayersEntity;
import netgloo.models.PlayersEntityDAO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@SpringUI
@Theme("valo")
public class VaadinUI extends UI {

    @Autowired
    private PlayersEntityDAO players;

    @Override
    protected void init(VaadinRequest request) {
        final VerticalLayout contentArea = new VerticalLayout();
        contentArea.setMargin(false);

        //setContent(new Button("Click me", e -> Notification.show("Hello Spring+Vaadin user!")));
        contentArea.addComponent(new Button("Click me", e -> Notification.show("Hello Spring+Vaadin user!")));

        Grid<PlayersEntity> grid = new Grid<>(PlayersEntity.class);
        grid.setColumnOrder("name", "mail", "firstname", "lastname");
        grid.setItems(players.findAll());

        contentArea.addComponent(grid);

        setContent(contentArea);

    }
}
