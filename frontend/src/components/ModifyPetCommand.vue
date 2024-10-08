<template>
    <v-card outlined>
        <v-card-title>
            ModifyPet
        </v-card-title>

        <v-card-text>
            <Number label="PetId" v-model="value.petId" :editMode="editMode"/>
            <String label="UserId" v-model="value.userId" :editMode="editMode"/>
            <String label="Name" v-model="value.name" :editMode="editMode"/>
            <Date label="BirthDate" v-model="value.birthDate" :editMode="editMode"/>
            <Date label="CreateAt" v-model="value.createAt" :editMode="editMode"/>
            <Number label="Weight" v-model="value.weight" :editMode="editMode"/>
            <Number label="Strength" v-model="value.strength" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="modifyPet"
            >
                ModifyPet
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'ModifyPetCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.petId = 0;
            this.value.userId = '';
            this.value.name = '';
            this.value.birthDate = '2024-10-08';
            this.value.createAt = '2024-10-08';
            this.value.weight = 0;
            this.value.strength = 0;
        },
        watch: {
        },
        methods: {
            modifyPet() {
                this.$emit('modifyPet', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

