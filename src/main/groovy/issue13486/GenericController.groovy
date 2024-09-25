package issue13486

import grails.artefact.Artefact

@Artefact("Controller")
class GenericController {
    def show(ModelResolver modelResolver) {}
}