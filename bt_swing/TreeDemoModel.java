
package bt_swing;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public class TreeDemoModel implements TreeModel  {

        DefaultTreeModel tree;
        DefaultMutableTreeNode rootNode;

    public TreeDemoModel() {
        //khởi tạo cây
        rootNode = buildTree("Car&Motor");
        tree = new DefaultTreeModel(rootNode);
        
    }
    
    private DefaultMutableTreeNode buildTree(String rootName){
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(rootName);
        //xây dựng các nút con cho nút root
        DefaultMutableTreeNode car = new DefaultMutableTreeNode("Car");
        DefaultMutableTreeNode motor = new DefaultMutableTreeNode("Motor");
        //Đưa vào nút root
        root.add(car);
        root.add(motor);
        
        DefaultMutableTreeNode honda = new DefaultMutableTreeNode("Honda");
        DefaultMutableTreeNode mazda = new DefaultMutableTreeNode("Mazda");
        DefaultMutableTreeNode toyota = new DefaultMutableTreeNode("Toyota");
        car.add(honda);
        car.add(toyota);
        car.add(mazda);
        
        //xây dựng các nút con cho motor 
        
        DefaultMutableTreeNode suzuki = new DefaultMutableTreeNode("suzuki");
        DefaultMutableTreeNode yamaha = new DefaultMutableTreeNode("Yamaha");
        motor.add(yamaha);
        motor.add(suzuki);
        
        return root;
    }
        public DefaultTreeModel getTree() {
        return tree;
    }

    public void setTree(DefaultTreeModel tree) {
        this.tree = tree;
    }

    public DefaultMutableTreeNode getRootNode() {
        return rootNode;
    }

    public void setRootNode(DefaultMutableTreeNode rootNode) {
        this.rootNode = rootNode;
    }

    
   @Override
    public Object getRoot() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.rootNode;
    }

    @Override
    public Object getChild(Object o, int i) {
        
        return tree.getChild(o, i);
    }

    @Override
    public int getChildCount(Object o) {
        
        return tree.getChildCount(o);
    }

    @Override
    public boolean isLeaf(Object o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return tree.isLeaf(o);
    }

    @Override
    public void valueForPathChanged(TreePath tp, Object o) {
        
        tree.valueForPathChanged(tp, o);
    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
        
        return tree.getIndexOfChild(parent, child);
    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {
     
        tree.addTreeModelListener(l);
    }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {
        tree.removeTreeModelListener(l);
    }
    
}
