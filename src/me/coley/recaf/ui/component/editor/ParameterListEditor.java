package me.coley.recaf.ui.component.editor;

import java.util.List;
import org.controlsfx.control.PropertySheet.Item;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.ParameterNode;
import javafx.scene.control.*;
import me.coley.recaf.ui.component.constructor.*;

/**
 * Editor for editing local variable table as {@code List<LocalVariableNode>}.
 * 
 * @author Matt
 */
public class ParameterListEditor extends ListEditor<ParameterNode, ParamConstructor, List<ParameterNode>> {
	public ParameterListEditor(Item item) {
		super(item, "ui.bean.method.parameters.name", 600, 600);
	}

	@Override
	protected ParamConstructor create(ListView<ParameterNode> view) {
		MethodNode method = (MethodNode) item.getOwner();
		return new ParamConstructor(method, view);
	}

	@Override
	protected ParameterNode getValue(ParamConstructor control) {
		return control.get();
	}

	@Override
	protected void reset(ParamConstructor control) {
		control.reset();
	}

	@Override
	protected void setupView(ListView<ParameterNode> view) {
		MethodNode method = (MethodNode) item.getOwner();
		view.setCellFactory(cell -> new ListCell<ParameterNode>() {
			@Override
			protected void updateItem(ParameterNode node, boolean empty) {
				super.updateItem(node, empty);
				if (empty || node == null) {
					setGraphic(null);
				} else {
					setGraphic(new ParamConstructor(method, view, node));
				}
			}
		});
	}
}