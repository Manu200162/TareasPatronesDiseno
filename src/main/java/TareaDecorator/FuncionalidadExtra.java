package TareaDecorator;

public class FuncionalidadExtra implements Component {
    private Component component;

    public FuncionalidadExtra(Component component){
        this.component=component;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        this.component.operation();
    }

    @Override
    public int getMonto() {
     return this.component.getMonto();
    }

    @Override
    public void setMonto(int Monto) {
        this.component.setMonto(Monto);
    }
}
