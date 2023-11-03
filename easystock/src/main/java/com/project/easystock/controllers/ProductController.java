package com.project.easystock.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Date;
import java.util.ResourceBundle;

import com.project.easystock.model.Produto;
import com.project.easystock.dao.ProdutoDao;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class ProductController {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	// nav bar buttons
	@FXML
	private Button btnClientpage;

	@FXML
	private Button btnDashbord;

	@FXML
	private Button btnFornecedoresPage;

	@FXML
	private Button btnRequestPage;

	@FXML
	private Button btnSalespage;

	// CRUD buttons

	@FXML
	private Button btnCRUDadicionar;

	@FXML
	private Button btnCRUDeditar;

	@FXML
	private Button btnCRUDexcluir;

	@FXML
	private Button btnCRUDpesquisar;

	// table
	@FXML
	private TableView<Produto> tableProdutos;
	
	// date 
	@FXML
    private DatePicker dtaAreaDtaEntradaAdicionar;

    @FXML
    private DatePicker dtaAreaDtaEntradaEditar;

    @FXML
    private DatePicker dtaAreaDtaEntradaPesquisa;
    
    // AnchorPane
    @FXML
    private AnchorPane paneCRUDadicionar;

    @FXML
    private AnchorPane paneCRUDeditar;

    @FXML
    private AnchorPane paneCRUDexcluir;

    @FXML
    private AnchorPane paneCRUDpesquisar;
    
    // error Text status
    @FXML
    private Text statusAdicao;

    @FXML
    private Text statusEdicao;

    @FXML
    private Text statusExclusao;

    @FXML
    private Text statusPesquisa;
    
    // txt
    @FXML
    private TextField txtAreaCategoriaAdicionar;

    @FXML
    private TextField txtAreaCategoriaEditar;

    @FXML
    private TextField txtAreaCategoriaPesquisa;

    @FXML
    private TextField txtAreaCodBarrasAdicionar;

    @FXML
    private TextField txtAreaCodBarrasEditar;

    @FXML
    private TextField txtAreaCodBarrasPesquisa;

    @FXML
    private TextField txtAreaDimencoesAdicionar;

    @FXML
    private TextField txtAreaDimencoesEditar;

    @FXML
    private TextField txtAreaDimencoesPesquisa;

    @FXML
    private TextField txtAreaFornecedorAdicionar;

    @FXML
    private TextField txtAreaFornecedorEditar;

    @FXML
    private TextField txtAreaFornecedorPesquisa;

    @FXML
    private TextField txtAreaIDadicionar;

    @FXML
    private TextField txtAreaIDeditar;

    @FXML
    private TextField txtAreaIDexclusao;

    @FXML
    private TextField txtAreaIDpesquisa;

    @FXML
    private TextField txtAreaLocArmazemAdicionar;

    @FXML
    private TextField txtAreaLocArmazemEditar;

    @FXML
    private TextField txtAreaLocArmazemPesquisa;

    @FXML
    private TextField txtAreaMarcaAdicionar;

    @FXML
    private TextField txtAreaMarcaEditar;

    @FXML
    private TextField txtAreaMarcaPesquisa;

    @FXML
    private TextField txtAreaNomeAdicionar;

    @FXML
    private TextField txtAreaNomeEditar;

    @FXML
    private TextField txtAreaNomePesquisa;

    @FXML
    private TextField txtAreaPesoAdicionar;

    @FXML
    private TextField txtAreaPesoEditar;

    @FXML
    private TextField txtAreaPesoPesquisa;

    @FXML
    private TextField txtAreaPrecoCustoAdicionar;

    @FXML
    private TextField txtAreaPrecoCustoEditar;

    @FXML
    private TextField txtAreaPrecoCustoPesquisa;

    @FXML
    private TextField txtAreaPrecoVendaAdicionar;

    @FXML
    private TextField txtAreaPrecoVendaEditar;

    @FXML
    private TextField txtAreaPrecoVendaPesquisa;

    @FXML
    private TextField txtAreaQtdEstoqueAdicionar;

    @FXML
    private TextField txtAreaQtdEstoqueEditar;

    @FXML
    private TextField txtAreaQtdEstoquePesquisa;

    @FXML
    private TextField txtAreaSKUPesquisa;

    @FXML
    private TextField txtAreaSKUadicionar;

    @FXML
    private TextField txtAreaSKUeditar;

    @FXML
    private TextField txtAreaSTSprodutoAdicionar;

    @FXML
    private TextField txtAreaSTSprodutoEditar;

    @FXML
    private TextField txtAreaSTSprodutoPesquisa;
	
	// navegação
	@FXML
	private void btnOpenClientPage(ActionEvent event) throws IOException {
		Stage stageAtual = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stageAtual.close();
		Stage novoStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/com/project/easystock/client.fxml"));
		Scene scene = new Scene(root);
		Image applicationIcon = new Image(getClass().getResourceAsStream("/com/project/easystock/img/logo-easystock2.png"));
		novoStage.getIcons().add(applicationIcon);
		novoStage.setTitle("EasyStock");
		novoStage.setResizable(false);
		novoStage.setScene(scene);
		novoStage.show();
	}

	@FXML
	private void btnOpenDashbord(ActionEvent event) throws IOException {
		Stage stageAtual = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stageAtual.close();
		Stage novoStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/com/project/easystock/index.fxml"));
		Scene scene = new Scene(root);
		Image applicationIcon = new Image(
				getClass().getResourceAsStream("/com/project/easystock/img/logo-easystock2.png"));
		novoStage.getIcons().add(applicationIcon);
		novoStage.setTitle("EasyStock");
		novoStage.setResizable(false);
		novoStage.setScene(scene);
		novoStage.show();
	}

	@FXML
	private void btnOpenFonecedoresPage(ActionEvent event) throws IOException {
		Stage stageAtual = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stageAtual.close();
		Stage novoStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/com/project/easystock/suppliers.fxml"));
		Scene scene = new Scene(root);
		Image applicationIcon = new Image(
				getClass().getResourceAsStream("/com/project/easystock/img/logo-easystock2.png"));
		novoStage.getIcons().add(applicationIcon);
		novoStage.setTitle("EasyStock");
		novoStage.setResizable(false);
		novoStage.setScene(scene);
		novoStage.show();
	}

	@FXML
	private void btnOpenRequestPage(ActionEvent event) throws IOException {
		Stage stageAtual = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stageAtual.close();
		Stage novoStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/com/project/easystock/requests.fxml"));
		Scene scene = new Scene(root);
		Image applicationIcon = new Image(
				getClass().getResourceAsStream("/com/project/easystock/img/logo-easystock2.png"));
		novoStage.getIcons().add(applicationIcon);
		novoStage.setTitle("EasyStock");
		novoStage.setResizable(false);
		novoStage.setScene(scene);
		novoStage.show();
	}

	@FXML
	private void btnOpenSalesPage(ActionEvent event) throws IOException {
		Stage stageAtual = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stageAtual.close();
		Stage novoStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/com/project/easystock/sales.fxml"));
		Scene scene = new Scene(root);
		Image applicationIcon = new Image(
				getClass().getResourceAsStream("/com/project/easystock/img/logo-easystock2.png"));
		novoStage.getIcons().add(applicationIcon);
		novoStage.setTitle("EasyStock");
		novoStage.setResizable(false);
		novoStage.setScene(scene);
		novoStage.show();
	}
	// fim navegação
	
	// configurações tabela principal
	public void preencherTableView() {
		// Obtém a lista de produtos
		ProdutoDao produtoDao = new ProdutoDao();
		List<Produto> produtos = produtoDao.listarProdutos();

		// Cria as colunas da tabela e define o valor de exibição baseado nos campos do
		
		// Produto
		TableColumn<Produto, Long> colunaId = new TableColumn<>("ID");
		colunaId.setCellValueFactory(new PropertyValueFactory<>("id"));
		
		TableColumn<Produto, String> colunaNome = new TableColumn<>("Nome");
		colunaNome.setCellValueFactory(new PropertyValueFactory<>("nome"));

		TableColumn<Produto, String> colunaCategoria = new TableColumn<>("Categoria");
		colunaCategoria.setCellValueFactory(new PropertyValueFactory<>("categoria"));

		TableColumn<Produto, Double> colunaPrecoVenda = new TableColumn<>("Preço de Venda");
		colunaPrecoVenda.setCellValueFactory(new PropertyValueFactory<>("precoVenda"));

		TableColumn<Produto, Double> colunaPrecoCusto = new TableColumn<>("Preço de Custo");
		colunaPrecoCusto.setCellValueFactory(new PropertyValueFactory<>("precoCusto"));

		TableColumn<Produto, Integer> colunaQuantidadeEstoque = new TableColumn<>("Quantidade em Estoque");
		colunaQuantidadeEstoque.setCellValueFactory(new PropertyValueFactory<>("quantidadeEstoque"));

		TableColumn<Produto, String> colunaFornecedor = new TableColumn<>("Fornecedor");
		colunaFornecedor.setCellValueFactory(new PropertyValueFactory<>("fornecedor"));

		TableColumn<Produto, Date> colunaDataEntrada = new TableColumn<>("Data de Entrada");
		colunaDataEntrada.setCellValueFactory(new PropertyValueFactory<>("dataEntrada"));

		TableColumn<Produto, String> colunaLocalizacaoArmazem = new TableColumn<>("Localização no Armazém");
		colunaLocalizacaoArmazem.setCellValueFactory(new PropertyValueFactory<>("localizacao"));

		TableColumn<Produto, String> colunaCodigoBarras = new TableColumn<>("Código de Barras");
		colunaCodigoBarras.setCellValueFactory(new PropertyValueFactory<>("codigoBarras"));

		TableColumn<Produto, Double> colunaPeso = new TableColumn<>("Peso");
		colunaPeso.setCellValueFactory(new PropertyValueFactory<>("peso"));

		TableColumn<Produto, String> colunaDimensoes = new TableColumn<>("Dimensões");
		colunaDimensoes.setCellValueFactory(new PropertyValueFactory<>("dimensoes"));

		TableColumn<Produto, String> colunaStatusProduto = new TableColumn<>("Status do Produto");
		colunaStatusProduto.setCellValueFactory(new PropertyValueFactory<>("statusProduto"));

		TableColumn<Produto, String> colunaSku = new TableColumn<>("SKU");
		colunaSku.setCellValueFactory(new PropertyValueFactory<>("sku"));

		TableColumn<Produto, String> colunaMarca = new TableColumn<>("Marca");
		colunaMarca.setCellValueFactory(new PropertyValueFactory<>("marca"));

		// Adiciona as colunas à TableView
		tableProdutos.getColumns().add(colunaId);
		tableProdutos.getColumns().add(colunaNome);
		tableProdutos.getColumns().add(colunaCategoria);
		tableProdutos.getColumns().add(colunaPrecoVenda);
		tableProdutos.getColumns().add(colunaPrecoCusto);
		tableProdutos.getColumns().add(colunaQuantidadeEstoque);
		tableProdutos.getColumns().add(colunaFornecedor);
		tableProdutos.getColumns().add(colunaDataEntrada);
		tableProdutos.getColumns().add(colunaLocalizacaoArmazem);
		tableProdutos.getColumns().add(colunaCodigoBarras);
		tableProdutos.getColumns().add(colunaPeso);
		tableProdutos.getColumns().add(colunaDimensoes);
		tableProdutos.getColumns().add(colunaStatusProduto);
		tableProdutos.getColumns().add(colunaSku);
		tableProdutos.getColumns().add(colunaMarca);

		// Converte a lista de produtos para um ObservableList
		ObservableList<Produto> produtosObservable = FXCollections.observableArrayList(produtos);

		// Define os itens da TableView
		tableProdutos.setItems(produtosObservable);
	}

	// navegação CRUD
	
	// Stage novoStage = new Stage();
	// Parent root =
	// FXMLLoader.load(getClass().getResource("/com/project/easystock/productWindowCRUD.fxml"));
	// Scene scene = new Scene(root);
	// Image applicationIcon = new
	// Image(getClass().getResourceAsStream("/com/project/easystock/img/logo-easystock2.png"));
	// novoStage.getIcons().add(applicationIcon);
	// novoStage.setTitle("EasyStock");
	// novoStage.setResizable(false);
	// novoStage.setScene(scene);
	// novoStage.initModality(Modality.APPLICATION_MODAL);
	// novoStage.showAndWait();
	
	

	@FXML
	private void gerenciarAdicoes(ActionEvent event){
		if (paneCRUDeditar.isVisible()) {
 			paneCRUDeditar.setVisible(false);
 			paneCRUDadicionar.setVisible(true);
 		} else if (paneCRUDexcluir.isVisible()) {
 			paneCRUDexcluir.setVisible(false);
 			paneCRUDadicionar.setVisible(true);
 		} else {
 			paneCRUDpesquisar.setVisible(false);
 			paneCRUDadicionar.setVisible(true);
 		}
	}

	@FXML
	private void gerenciarEditar(ActionEvent event){
		if (paneCRUDadicionar.isVisible()) {
 			paneCRUDadicionar.setVisible(false);
 			paneCRUDeditar.setVisible(true);
 		} else if (paneCRUDexcluir.isVisible()) {
 			paneCRUDexcluir.setVisible(false);
 			paneCRUDeditar.setVisible(true);
 		} else {
 			paneCRUDpesquisar.setVisible(false);
 			paneCRUDeditar.setVisible(true);
 		}
	}

	@FXML
	private void gerenciarExcluir(ActionEvent event){
		if (paneCRUDadicionar.isVisible()) {
 			paneCRUDadicionar.setVisible(false);
 			paneCRUDexcluir.setVisible(true);
 		} else if (paneCRUDeditar.isVisible()) {
 			paneCRUDeditar.setVisible(false);
 			paneCRUDexcluir.setVisible(true);
 		} else {
 			paneCRUDpesquisar.setVisible(false);
 			paneCRUDexcluir.setVisible(true);
 		}
	}

	@FXML
	private void gerenciarPesquisa(ActionEvent event){
		if (paneCRUDadicionar.isVisible()) {
 			paneCRUDadicionar.setVisible(false);
 			paneCRUDpesquisar.setVisible(true);
 		} else if (paneCRUDeditar.isVisible()) {
 			paneCRUDeditar.setVisible(false);
 			paneCRUDpesquisar.setVisible(true);
 		} else {
 			paneCRUDexcluir.setVisible(false);
 			paneCRUDpesquisar.setVisible(true);
 		}
	}
	// fim navegação CRUD
	
	// AnchorPane buttons adicionar
	@FXML
    void btnAplicarAdicao(ActionEvent event) {

    }
	
	@FXML
    void btnCancelarAdicao(ActionEvent event) {

    }
	
	@FXML
    void btnLimparAdicao(ActionEvent event) {

    }
	
	// AnchorPane buttons Editar
    @FXML
    void btnAplicarEdicao(ActionEvent event) {

    }
    
    @FXML
    void btnCancelarEdicao(ActionEvent event) {

    }
    
    @FXML
    void btnLimparEdicao(ActionEvent event) {

    }
    
    // AnchorPane buttons Exclusão
    @FXML
    void btnAplicarExclusao(ActionEvent event) {

    }
    
    @FXML
    void btnCancelarExcusao(ActionEvent event) {

    }
    
    @FXML
    void btnLimparExclusao(ActionEvent event) {

    }
    
    // AnchorPane buttons Pesquisa
    @FXML
    void btnAplicarPesquisa(ActionEvent event) {

    }
 
    @FXML
    void btnCancelarPesquisa(ActionEvent event) {

    }

    @FXML
    void btnLimparPesquisa(ActionEvent event) {

    }

	@FXML
	void initialize() {
		preencherTableView();

		 	assert btnCRUDadicionar != null : "fx:id=\"btnCRUDadicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert btnCRUDeditar != null : "fx:id=\"btnCRUDeditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert btnCRUDexcluir != null : "fx:id=\"btnCRUDexcluir\" was not injected: check your FXML file 'product.fxml'.";
	        assert btnCRUDpesquisar != null : "fx:id=\"btnCRUDpesquisar\" was not injected: check your FXML file 'product.fxml'.";
	        assert btnClientpage != null : "fx:id=\"btnClientpage\" was not injected: check your FXML file 'product.fxml'.";
	        assert btnDashbord != null : "fx:id=\"btnDashbord\" was not injected: check your FXML file 'product.fxml'.";
	        assert btnFornecedoresPage != null : "fx:id=\"btnFornecedoresPage\" was not injected: check your FXML file 'product.fxml'.";
	        assert btnRequestPage != null : "fx:id=\"btnRequestPage\" was not injected: check your FXML file 'product.fxml'.";
	        assert btnSalespage != null : "fx:id=\"btnSalespage\" was not injected: check your FXML file 'product.fxml'.";
	        assert dtaAreaDtaEntradaAdicionar != null : "fx:id=\"dtaAreaDtaEntradaAdicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert dtaAreaDtaEntradaEditar != null : "fx:id=\"dtaAreaDtaEntradaEditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert dtaAreaDtaEntradaPesquisa != null : "fx:id=\"dtaAreaDtaEntradaPesquisa\" was not injected: check your FXML file 'product.fxml'.";
	        assert paneCRUDadicionar != null : "fx:id=\"paneCRUDadicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert paneCRUDeditar != null : "fx:id=\"paneCRUDeditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert paneCRUDexcluir != null : "fx:id=\"paneCRUDexcluir\" was not injected: check your FXML file 'product.fxml'.";
	        assert paneCRUDpesquisar != null : "fx:id=\"paneCRUDpesquisar\" was not injected: check your FXML file 'product.fxml'.";
	        assert statusAdicao != null : "fx:id=\"statusAdicao\" was not injected: check your FXML file 'product.fxml'.";
	        assert statusEdicao != null : "fx:id=\"statusEdicao\" was not injected: check your FXML file 'product.fxml'.";
	        assert statusExclusao != null : "fx:id=\"statusExclusao\" was not injected: check your FXML file 'product.fxml'.";
	        assert statusPesquisa != null : "fx:id=\"statusPesquisa\" was not injected: check your FXML file 'product.fxml'.";
	        assert tableProdutos != null : "fx:id=\"tableProdutos\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaCategoriaAdicionar != null : "fx:id=\"txtAreaCategoriaAdicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaCategoriaEditar != null : "fx:id=\"txtAreaCategoriaEditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaCategoriaPesquisa != null : "fx:id=\"txtAreaCategoriaPesquisa\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaCodBarrasAdicionar != null : "fx:id=\"txtAreaCodBarrasAdicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaCodBarrasEditar != null : "fx:id=\"txtAreaCodBarrasEditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaCodBarrasPesquisa != null : "fx:id=\"txtAreaCodBarrasPesquisa\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaDimencoesAdicionar != null : "fx:id=\"txtAreaDimencoesAdicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaDimencoesEditar != null : "fx:id=\"txtAreaDimencoesEditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaDimencoesPesquisa != null : "fx:id=\"txtAreaDimencoesPesquisa\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaFornecedorAdicionar != null : "fx:id=\"txtAreaFornecedorAdicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaFornecedorEditar != null : "fx:id=\"txtAreaFornecedorEditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaFornecedorPesquisa != null : "fx:id=\"txtAreaFornecedorPesquisa\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaIDadicionar != null : "fx:id=\"txtAreaIDadicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaIDeditar != null : "fx:id=\"txtAreaIDeditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaIDexclusao != null : "fx:id=\"txtAreaIDexclusao\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaIDpesquisa != null : "fx:id=\"txtAreaIDpesquisa\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaLocArmazemAdicionar != null : "fx:id=\"txtAreaLocArmazemAdicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaLocArmazemEditar != null : "fx:id=\"txtAreaLocArmazemEditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaLocArmazemPesquisa != null : "fx:id=\"txtAreaLocArmazemPesquisa\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaMarcaAdicionar != null : "fx:id=\"txtAreaMarcaAdicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaMarcaEditar != null : "fx:id=\"txtAreaMarcaEditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaMarcaPesquisa != null : "fx:id=\"txtAreaMarcaPesquisa\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaNomeAdicionar != null : "fx:id=\"txtAreaNomeAdicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaNomeEditar != null : "fx:id=\"txtAreaNomeEditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaNomePesquisa != null : "fx:id=\"txtAreaNomePesquisa\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaPesoAdicionar != null : "fx:id=\"txtAreaPesoAdicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaPesoEditar != null : "fx:id=\"txtAreaPesoEditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaPesoPesquisa != null : "fx:id=\"txtAreaPesoPesquisa\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaPrecoCustoAdicionar != null : "fx:id=\"txtAreaPrecoCustoAdicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaPrecoCustoEditar != null : "fx:id=\"txtAreaPrecoCustoEditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaPrecoCustoPesquisa != null : "fx:id=\"txtAreaPrecoCustoPesquisa\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaPrecoVendaAdicionar != null : "fx:id=\"txtAreaPrecoVendaAdicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaPrecoVendaEditar != null : "fx:id=\"txtAreaPrecoVendaEditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaPrecoVendaPesquisa != null : "fx:id=\"txtAreaPrecoVendaPesquisa\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaQtdEstoqueAdicionar != null : "fx:id=\"txtAreaQtdEstoqueAdicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaQtdEstoqueEditar != null : "fx:id=\"txtAreaQtdEstoqueEditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaQtdEstoquePesquisa != null : "fx:id=\"txtAreaQtdEstoquePesquisa\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaSKUPesquisa != null : "fx:id=\"txtAreaSKUPesquisa\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaSKUadicionar != null : "fx:id=\"txtAreaSKUadicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaSKUeditar != null : "fx:id=\"txtAreaSKUeditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaSTSprodutoAdicionar != null : "fx:id=\"txtAreaSTSprodutoAdicionar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaSTSprodutoEditar != null : "fx:id=\"txtAreaSTSprodutoEditar\" was not injected: check your FXML file 'product.fxml'.";
	        assert txtAreaSTSprodutoPesquisa != null : "fx:id=\"txtAreaSTSprodutoPesquisa\" was not injected: check your FXML file 'product.fxml'.";

	}

}
