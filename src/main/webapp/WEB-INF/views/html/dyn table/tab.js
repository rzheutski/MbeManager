var d = document;

function addLayer(rowIndex) {
    var structureTable = d.getElementById('editTab').getElementsByTagName('TBODY')[0];
    var newRow = structureTable.insertRow(rowIndex + 1);
    newRow.innerHTML = d.getElementById('editTab').rows[rowIndex].innerHTML;
    newRow.attributes = d.getElementById('editTab').rows[rowIndex].attributes;
}

function deleteLayer(rowIndex) {
    var structureTable = d.getElementById('editTab').getElementsByTagName('TBODY')[0];
    structureTable.deleteRow(rowIndex);
}

function rowNumbering(id) {
    var table = d.getElementById(id).getElementsByTagName('TBODY')[0];
    for (rowIndex = 1; rowIndex < table.rows.length; rowIndex++) {
        table.rows[rowIndex].cells[0].innerHTML = rowIndex;
    }
   // table.rows[2].cells[1].innerHTML = id;
   // var rows = table.getElementsByTagName("tr");
}
