window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Bloco = window.blockly.js.blockly.Bloco || {};

/**
 * @function Executar
 *
 * Bloco
 *
 *
 * @author Rafael Juan Cardoso Martins
 * @since 03/05/2023, 16:37:28
 *
 */
window.blockly.js.blockly.Bloco.ExecutarArgs = [];
window.blockly.js.blockly.Bloco.Executar = async function() {

  //
  this.cronapi.screen.notify('success','Olá mundo');
}
