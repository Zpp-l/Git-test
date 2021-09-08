package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;

public class Controller {
    @FXML
    private BorderPane borderPane;

    @FXML
    private TreeView<?> treeView;

    @FXML
    private TableView<?> TView;

    @FXML
    private TableColumn<?, ?> Kuai;

    @FXML
    private TableColumn<?, ?> Value;

    @FXML
    private TableColumn<?, ?> Type;

    @FXML
    private TableColumn<?, ?> Text;

    @FXML
    private FlowPane flowPane;

    @FXML
    private Button backBt;

    @FXML
    private Button AheadBt;

    @FXML
    private TableView<?> underTView;

    @FXML
    private TableColumn<?, ?> fPath;

    @FXML
    private TableColumn<?, ?> fPoper;

    @FXML
    private TableColumn<?, ?> Start;

    @FXML
    private TableColumn<?, ?> fLength;

    @FXML
    private TableColumn<?, ?> operType;

    @FXML
    private TableColumn<?, ?> RedPoint;

    @FXML
    private TableColumn<?, ?> WritePoint;
}
